const form_data = $('#infoData');

const myinfo = () => {

    const getting = $.get(form_data.attr('action'));

    getting.done(function (data) {
        console.log(data);
        const _data = data.data[0];
        if (data.stat = "true") {
            console.log(_data);
            $('#span_date').html(_data.modifyDtStr);
            $('#input_name').html(_data.name);
            $('#input_age').html(_data.age);
            $('#input_tel').html(_data.tel);
            $('#input_email').html(_data.email);

        } else {
            alert('data.log');
        }

    });
}

$(document).ready(function () {
    myinfo();
})