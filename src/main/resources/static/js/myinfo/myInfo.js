const form_data = $('#infoData');

const myinfo = () => {

    const getting = $.get(form_data.attr('action'));

    getting.done(function (data) {
        console.log(data);
        const _data = data.data[0];
        if (data.stat = "true") {
            console.log(_data);
            $('#div_modifyDt').val(_data.modifyDtStr);
            $('#div_name').val(_data.name);
            $('#div_age').val(_data.age);
            $('#div_tel').val(_data.tel);
            $('#div_email').val(_data.email);

        } else {
            showErrorMessage(data.msg);
        }

    });
}

$('#button_home').on('click', function(e) {
    e.preventDefault();

    location.href='/';
})

$('#button_update').on('click', function(e) {
    e.preventDefault();

    $('#myinfo_modal').modal('show');
})

$(document).ready(function () {
    myinfo();
})