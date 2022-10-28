window.onresize = function () {
    printCurrentWindowWidth();
}

window.onload = function () {
    printCurrentWindowWidth();
}

function printCurrentWindowWidth() {
    let size = window.innerWidth
    $('.ww').text(size + "px")
}
s