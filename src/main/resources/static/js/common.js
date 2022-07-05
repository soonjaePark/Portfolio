const showMessageModal = $('#showMessage');
const showErrorMessageModal = $('#showErrorMessage');

const showMessage = (msg) => {
    
    $('#modal_body').text(msg);

    showMessageModal.modal('show');
}

const showErrorMessage = (msg) => {
    
    $('#modal_body').text(msg);

    showErrorMessageModal.modal('show');

}

$('#showMessage').on('click', 'button', function(e) {
    e.preventDefault();
    $('#showMessage').modal('hide');
})

$('#showErrorMessage').on('click', 'button', function(e) {
    e.preventDefault();
    $('#showMessage').modal('hide');
})