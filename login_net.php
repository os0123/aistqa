<?php
if(isset($_POST['login'])){
    $user = $_POST['user'];
    $pass = $_POST['pass'];
    if($user=="Vaishu" && $pass=="1234"){
        echo"<h1>Welcome Vaishnavi</h1>";
    }
    else{
        echo"<h1>Invalid username or password</h1>";
    }
}
?>
<html>
    <body>
        <br>
        <br>
        <form method="POST">
            <input placeholder="Enter Username" type="text" name="user" id="user"/><br>
            <input placeholder="Enter Password" type="password" name="pass" id="pass"/><br>
            <button name="login" id="login" type="submit">Login</button>
</form>
</body>
</html>
