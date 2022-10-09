window.onload = function () {
    let block = document.querySelector("#block");
    let posY = document.querySelector("#pos-y");
    let posX = document.querySelector("#pos-x");
    let size = document.querySelector("#size");
    let opacity = document.querySelector("#opacity");
    let shapeOkButton = document.querySelector("#ok-shape");
    let shapeValue = document.querySelector("#shape-select");
    let hex = document.querySelector("#hex");
    let rgbRed = document.querySelector("#rgba-r");
    let rgbGreen = document.querySelector("#rgba-g");
    let rgbBlue = document.querySelector("#rgba-b");
    let rgbAlpha = document.querySelector("#rgba-a");
    let rgbIps = document.querySelectorAll(".rgba-container>input");
    let rotateDeg = 0
    posY.onchange = function () {
        let posYValue = document.querySelector("#posy-value");
        posYValue.textContent = posY.value
        block.style.top = posY.value + "px"
    }
    posX.onchange = function () {
        let posXValue = document.querySelector("#posx-value");
        posXValue.textContent = posX.value
        block.style.left = posX.value + "px"
    }
    size.onchange = function () {
        let sizeValue = document.querySelector("#size-value");
        sizeValue.textContent = size.value
        block.style.transform = 'rotate(' + rotateDeg + 'deg)  scale(' + size.value + ')'
    }
    opacity.onchange = function () {
        let opacityValue = document.querySelector("#opacity-value");
        opacityValue.textContent = opacity.value
        block.style.opacity = opacity.value
    }
    shapeOkButton.onclick = function () {
        let option = shapeValue.value
        if (option === 'square') {
            rotateDeg = 0
            block.style.borderRadius = '0'
            block.style.transform = 'rotate(' + rotateDeg + 'deg)  scale(' + size.value + ')'
        } else if (option === 'circle') {
            block.style.borderRadius = '50%'
        } else if (option === 'rhombus') {
            rotateDeg = 45
            block.style.borderRadius = '0'
            block.style.transform = 'rotate(' + rotateDeg + 'deg) scale(' + size.value + ')'
        }
    }
    hex.onkeypress = function (event) {
        if (event.which === 13) {
            block.style.background = '#' + hex.value
            hex.value = ''
        }
    }
    for (let rgbIp of rgbIps) {
        rgbIp.onchange = function () {
            block.style.background = `rgba(${rgbRed.value}, ${rgbGreen.value}, ${rgbBlue.value}, ${rgbAlpha.value})`
        }
    }


}