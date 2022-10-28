$("#selectedFile").on('change', function () {
    let file = this.files[0];
    console.log(file);
    let fr = new FileReader();
    fr.onload = function (event) {
        $("#thumbnail").attr('src', event.target.result);
    }
    if (file) {
        fr.readAsDataURL(file);
    }
}
)