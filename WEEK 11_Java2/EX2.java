<!DOCTYPE html>
<html lang="en">
function formValid() {}
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   function formValid() {
    f = document.frmRegister;
    var phone_pattern = /^(\(0\d{1,3}\)\d{7})|(0\d{9,10})$/;
    var email_pattern = /^[a-zA-A]\w*(\.\w+)*\@\w+(\.\w{2,3})+$/;
    if(f.txtUsername.value==""){
        altert("Username can't be empty");
        f.txtUsername.focus();
        return false;
    }
    if(f.txtPassword1.value.length < 6){
        altert("Password length must be from 6 to 20 characters");
        f.txtPassword1.focus();
        return failse;
    }
    if(f.txtPassword1.value != f.txtPassword2.value){
        alert("Password doén't match");
        f.txtPassword2.focus();
        return false;
    }
    if(phone_pattern.test(f.txtPhone.value)==false){
        alert("Invalid phone number");
        f.txtPhone.focus();
        return false;
    }
    if(email_pattern.test(f.txtEmail.value)==false){
        alert("Invalid email address");
        f.txtEmail.focus();
        return false;
    }
    if(f.chkMusic.checked==False && f.chkReading.checked==false){
        alert("You must select at least one favourite");
        f.chkMusic.focus();
        return false;
    }
    if(f.filPicture.value==""){
        alert("You must select your picture");
        f.filPicture.focus();
        return false;
    }
    if(f.txtDescription.value==""){
        alert("You must enter description");
        f.txtDescription.focus();
        return false;
    }
    alert("All register information are correct.");
    return true;
   } 
</body>
</html>