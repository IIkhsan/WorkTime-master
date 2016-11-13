/**
 * Created by iikhsn on 08.11.16.
 */
$(document).ready(function () {
    $("#newPerson").validate({
        rules : {
            name : "required",
            passwordField : {required:true, minlength: 8},
            loginField : {required:true, minlength: 5},
            lastname : "required"
        },
        messages : {
            loginField : {
                required : "Type login please",
                minlength : "Minimal length 5 symbol"
            },
            passwordField : {
                required :"Type password",
                minlength : "Minimal lenght 8 symbol"
            },
            lastname : "Type lastname!"
        },
        


        highlight:function (element) {
            $(element).css('border-color','red')
        },
        unhighlight:function (element) {
            $(element).css('border-color','rgb(210,210,210)')
        },
        submitHandler: function (form) {
            form.submit();
        }
    });
});