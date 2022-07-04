const update_form = $('#update_form');



const saveFunc= () => {
    console.log("ok");
    const posting = $.post(update_form.attr('action'), update_form.serialize());

    posting.done(function(data){
        console.log(data);
        if(data.stat = "true"){

        }else{
            showErrorMessage(data.msg);
        }
    })
}

$('#button_save').on('click', function(e){
    e.preventDefault();
    console.log('sub');
    saveFunc();
})

$(document).ready(function () {
    console.log("start");
})