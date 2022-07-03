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