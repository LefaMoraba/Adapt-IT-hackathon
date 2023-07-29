<?php
$username = "s2456518";
$password = "s2456518";
$database = "d2456518";
$link = mysqli_connect("127.0.0.1", $username, $password, $database);

if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

$USER_FNAME =  $_REQUEST['first_name'];
$USER_LNAME = $_REQUEST['last_name'];
$USER_ID =  $_REQUEST['id'];
$USER_EMAIL = $_REQUEST['email'];
$USER_PASSWORD = $_REQUEST['passowrd'];

$sql = "INSERT INTO USER (USER_FNAME, USER_LNAME, USER_ID, USER_EMAIL, USER_PASSWORD)
VALUES ('$USER_FNAME', '$USER_LNAME', '$USER_ID', '$USER_EMAIL', '$USER_PASSWORD')";

if (mysqli_query($conn, $sql)) {
  echo "New record created successfully";
} else {
  echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}

mysqli_close($link);
echo json_encode($output);
?>
