let currentUrl = window.location.href

highlightPage('customer', '.customer-nav')
highlightPage('stuff', '.stuff-nav')
highlightPage('admin', '.admin-nav')
function highlightPage(componentName, componentCssClass) {
    const element = document.querySelector(componentCssClass);
    currentUrl.includes(componentName) ?
        element.classList.add('active') : element.classList.remove('active');
}

