<?php
/* Initialize the session */
session_start();

/* Check if the user is already logged in, if yes then redirect him to welcome page */
if (isset($_SESSION["loggedin"]) && $_SESSION["loggedin"] === true)
{
    header("location: welcome.php");
    exit;
}

/* Include config file */
require_once "config.php";

/* Define variables and initialize with empty values */
$username = $password = "";
$username_err = $password_err = "";

/* Processing form data when form is submitted */
if ($_SERVER["REQUEST_METHOD"] == "POST")
{

    /* Check if username is empty */
    if (empty(trim($_POST["username"])))
    {
        $username_err = "Please enter username.";
    }
    else
    {
        $username = trim($_POST["username"]);

    }

    /* Check if password is empty */
    if (empty(trim($_POST["password"])))
    {
        $password_err = "Please enter your password.";
    }
    else
    {
        $password = trim($_POST["password"]);
    }

    /* Validate credentials */
    if (empty($username_err) && empty($password_err))
    {
        /* Prepare a sql query statement */
	$username = stripcslashes($username);
	$password = stripcslashes($password);
	$username = mysqli_real_escape_string($link, $username);
	$password = mysqli_real_escape_string($link, $password);
        $sql = "SELECT id, username FROM users WHERE username = '$username' and password = '$password' ";

        $result = mysqli_query($link, $sql);

        if (mysqli_num_rows($result) > 0)
        {
            session_start();

            /* Store data in session variables */
            $_SESSION["loggedin"] = true;
            $_SESSION["id"] = $id;
            $_SESSION["username"] = $username;

            /* Redirect user to welcome page */
            header("location: welcome.php");
        }
        else
        {
            /* Display an error message if there is no row selected. */
            $password_err = "The password you entered was not valid.";
        }
        /* Close statement */
        mysqli_close($link);
    }
}
?>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="bootstrap.css">
    <style type="text/css">
        body{ font: 14px sans-serif; }
        .wrapper{ width: 350px; padding: 20px; }
        .project-info-button {
        background-color: #ff0000;
        color: #ffffff;
        padding: 10px 20px;
        border: none;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
        display: block;
        margin: 0 auto;
        width: 150px;
        text-align: center;
        line-height: 1.5;
      }

      .project-info-button:hover {
        background-color: #cc0000;
      }
    </style>
</head>
<body>
    <div class="wrapper">
        <a href="Project Information.html" target="_blank" class="form-group input[type='submit'] project-info-button">Project Info</a>
        <h2>Login</h2>
        <p>Please fill in your credentials to login.</p>
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
            <div class="form-group <?php echo (!empty($username_err)) ? 'has-error' : ''; ?>">
                <label>Username</label>
                <input type="text" name="username" autocomplete="off" class="form-control" value="<?php echo $username; ?>">
                <span class="help-block"><?php echo $username_err; ?></span>
            </div>    
            <div class="form-group <?php echo (!empty($password_err)) ? 'has-error' : ''; ?>">
                <label>Password</label>
                <input type="password" name="password" autocomplete="off" class="form-control">
                <span class="help-block"><?php echo $password_err; ?></span>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Login">
            </div>
            <p>Don't have an account? <a href="register.php">Sign up now</a>.</p>
        </form>
    </div>    
</body>
</html>
