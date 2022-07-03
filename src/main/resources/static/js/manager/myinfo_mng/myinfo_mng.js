const form_data = $('#infoData');

const myinfo = () => {
    var _url = '/mng/myinfo/data';
    const getting = $.get(_url);

    getting.done(function (data) {            
        const _data = data.data[0];
        if (data.stat = "true") {
            $('#input_seq').val(_data.seq);
            $('#span_date').html(_data.modifyDtStr);
            $('#input_name').val(_data.name);
            $('#input_age').val(_data.age);
            $('#input_tel').val(_data.tel);
            $('#input_email').val(_data.email);

        } else {
            alert(data.msg);
        }
    });
    getting.fail((error) => {
        alert("서버 통신에 오류가 발생하였습니다");
    })
}


const updateMyinfo = () => {

    const posting = $.post(form_data.attr('action'), form_data.serialize());
    posting.done(function(data) {
        console.log(data);
        if(data.stat == "true"){
            myinfo();
            showMessage(data.msg);
        }else{
            // showErrorMessage(data.msg);
        }
    })
    posting.fail((error)=> {
        alert("서버 통신에 오류가 발생하였습니다");
    })
} 


$(document).ready(function () {
    
    form_data.on('submit', function(e){
        e.preventDefault();
        updateMyinfo();
    })


    myinfo();
})