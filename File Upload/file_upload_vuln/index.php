<!DOCTYPE html>
<html>
<head>
  <title>File Upload Example</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 20px;
      background-color: #f4f4f4;
    }

    h1 {
      text-align: center;
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      background-color: #ffffff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    .form-group {
      margin-bottom: 20px;
    }

    .form-group label {
      display: block;
      margin-bottom: 5px;
    }

    .form-group input[type="file"] {
      display: block;
      padding: 5px;
      font-size: 16px;
    }

    .form-group input[type="submit"] {
      background-color: #4caf50;
      color: #ffffff;
      padding: 10px 20px;
      border: none;
      font-size: 16px;
      border-radius: 5px;
      cursor: pointer;
    }

    .form-group input[type="submit"]:hover {
      background-color: #45a049;
    }

    .message {
      margin-top: 20px;
      text-align: center;
      font-weight: bold;
    }

    .error {
      color: #ff0000;
    }

    .success {
      color: #008000;
    }

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
    width: 100px;
    text-align: center;
    line-height: 1.5;
  }

  .project-info-button:hover {
    background-color: #cc0000;
  }
  </style>
</head>
<body>
  <div class="container">
    <div class="form-group">
      <a href="Project Information.html" target="_blank" class="form-group input[type='submit'] project-info-button">Project Info</a>
    </div>
    <h1>File Upload</h1>
    <form action="upload.php" method="POST" enctype="multipart/form-data">
      <div class="form-group">
        <label for="fileUpload">Select a file to upload:</label>
        <input type="file" name="fileUpload" id="fileUpload" />
      </div>
      <div class="form-group">
        <input type="submit" value="Upload File" />
      </div>
    </form>
    <div class="message">
      <?php
        if (isset($_GET['error'])) {
          $error = $_GET['error'];
          echo "<span class='error'>Error: $error</span>";
        } elseif (isset($_GET['success'])) {
          $success = $_GET['success'];
          echo "<span class='success'>$success</span>";
        }
      ?>
    </div>
  </div>
</body>
</html>
