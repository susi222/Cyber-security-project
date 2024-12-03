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
