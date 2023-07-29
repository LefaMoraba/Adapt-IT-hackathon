<?php
$username = "s2456518";
$password = "s2456518";
$database = "d2456518";
$link = mysqli_connect("127.0.0.1", $username, $password, $database);

if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

$USER_EMAIL = $_REQUEST['email'];
$USER_PASSWORD = $_REQUEST['passowrd'];

$sql = "SELECT * FROM USER WHERE USER_EMAIL = '$USER_EMAIL' AND USER_PASSWORD = '$USER'";

$results = mysqli_query($conn, $sql);

if (mysqli_query($results)==1) {
  echo "Login successful";
} 
else {
  echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}

mysqli_close($link);
echo json_encode($output);
?>
