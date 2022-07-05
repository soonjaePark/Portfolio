const update_form = $('#update_form');


const saveFunc= () => {
    const posting = $.post(update_form.attr('action'), update_form.serialize());

    posting.done(function(data){    
        if(data.stat = "true"){
            $('#myinfo_modal').modal('hide');
            console.log(data.msg);
            showMessage(data.msg);
            myinfo();
        }else{
            showErrorMessage(data.msg);
        }
    })
}

$('#button_save').on('click', function(e){
    e.preventDefault();
    saveFunc();
})

$(document).ready(function () {
    console.log("start");
})