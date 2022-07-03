const form_data = $('#infoData');

const myinfo = () => {

    const getting = $.get(form_data.attr('action'));

    getting.done(function (data) {
        console.log(data);
        const _data = data.data[0];
        if (data.stat = "true") {
            console.log(_data);
            $('#span_date').val(_data.modifyDtStr);
            $('#input_name').val(_data.name);
            $('#input_age').val(_data.age);
            $('#input_tel').val(_data.tel);
            $('#input_email').val(_data.email);

        } else {
            showErrorMessage(data.msg);
        }

    });
}

$(document).ready(function () {
    myinfo();
})