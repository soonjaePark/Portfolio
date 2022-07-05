const form_data = $('#infoData');
//const update_modal = new bootstrap.Modal('#myinfo_modal');

const myinfo = () => {

    const getting = $.get(form_data.attr('action'));

    getting.done(function (data) {
        console.log(data);
        const _data = data.data[0];
        if (data.stat = "true") {
            console.log(_data);
            $('#div_modifyDt').html(_data.modifyDtStr);
            $('#div_name').html(_data.name);
            $('#div_age').html(_data.age);
            $('#div_tel').html(_data.tel);
            $('#div_email').html(_data.email);
            $('#input_seq').val(_data.seq);

        } else {
            showErrorMessage(data.msg);
        }

    });
}

const myinfoDetail = (data) => {
    $('#update_name').val(data.name);
    $('#update_age').val(data.age);
    $('#update_tel').val(data.tel);
    $('#update_email').val(data.email);

    $('#myinfo_modal').modal('show');

}

$('#button_home').on('click', function(e) {
    e.preventDefault();
    
    location.href='/';
})

$('#button_update').on('click', function(e) {
    e.preventDefault();
    const _url = '/myinfo/detail/' + $('#input_seq').val();
    const getting = $.get(_url);

    getting.done(function(data) {
        console.log(data);
        if(data.stat='true'){
            myinfoDetail(data.data);
        }else{
            showErrorMessage(data.msg);
        }
    })
})

$(document).ready(function () {
    myinfo();
})