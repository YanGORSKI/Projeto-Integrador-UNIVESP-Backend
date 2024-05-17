document.addEventListener("DOMContentLoaded", function() {
    let btn = document.querySelector("#menu_btn");
    let sidebar = document.querySelector(".sidebar");

    btn.onclick = function() {
        sidebar.classList.toggle("active");
    };
});