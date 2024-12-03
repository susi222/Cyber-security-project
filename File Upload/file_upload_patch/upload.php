<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  if (empty($_FILES["fileUpload"]["name"])) {
    $errorMessage = "Please select a file to upload.";
    header("Location: index.php?error=" . urlencode($errorMessage));
    exit();
  }

  $targetDirectory = "uploads/";
  $targetFile = $targetDirectory . basename($_FILES["fileUpload"]["name"]);
  $uploadOk = 1;
  $fileType = strtolower(pathinfo($targetFile, PATHINFO_EXTENSION));

  // Check if file already exists
  if (file_exists($targetFile)) {
    $errorMessage = "Sorry, the file already exists.";
    header("Location: index.php?error=" . urlencode($errorMessage));
    exit();
  }

  // Check file size (in this example, limited to 5MB)
  if ($_FILES["fileUpload"]["size"] > 5 * 1024 * 1024) {
    $errorMessage = "Sorry, the file is too large. Maximum size allowed is 5MB.";
    header("Location: index.php?error=" . urlencode($errorMessage));
    exit();
  }

  // Allow only specific file types (e.g., JPG, PNG)
  $allowedFileTypes = ["jpg", "jpeg", "png"];
  if (!in_array($fileType, $allowedFileTypes)) {
    $errorMessage = "Sorry, only JPG, JPEG, and PNG files are allowed.";
    header("Location: index.php?error=" . urlencode($errorMessage));
    exit();
  }

  // Check if $uploadOk is set to 0 by an error
  if ($uploadOk == 0) {
    $errorMessage = "Sorry, your file was not uploaded.";
    header("Location: index.php?error=" . urlencode($errorMessage));
    exit();
  } else {
    // Move the uploaded file to the target directory
    if (move_uploaded_file($_FILES["fileUpload"]["tmp_name"], $targetFile)) {
      $successMessage = "The file " . basename($_FILES["fileUpload"]["name"]) . " has been uploaded successfully.";
      header("Location: index.php?success=" . urlencode($successMessage));
      exit();
    } else {
      $errorMessage = "Sorry, there was an error uploading your file.";
      header("Location: index.php?error=" . urlencode($errorMessage));
      exit();
    }
  }
}
?>
