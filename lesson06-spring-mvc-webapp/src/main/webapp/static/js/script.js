let currentUrl = window.location.href

function highlightPage(componentName, componentCssClass) {
    const element = document.querySelector(componentCssClass);
    currentUrl.includes(componentName) ?
        element.classList.add('active') : element.classList.remove('active');
}

function handleMessageInfo() {
    let message = document.querySelector(".message")
    if (message) {
        let counter = 5;
        let interval = setInterval(function () {
            counter--;
            if (counter === 0) {
                message.style.display = 'none'
                clearInterval(interval)
            }
        }, 1000)
    }
    if (message.textContent.includes("successfully")) {
        message.classList.add('alert-success')
    } else if (message.textContent.includes("unsuccessfully")) {
        message.classList.add('alert-success')
    }
}

highlightPage('customer', '.customer-nav')
highlightPage('stuff', '.stuff-nav')
highlightPage('admin', '.admin-nav')

handleMessageInfo();

