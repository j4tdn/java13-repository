$(document).ready(function () {
    let btnAdd = $(".add-button")
    let input = $(".add-text")
    let message = $(".message")
    let tasks = $(".tasks")

    btnAdd.on('click', function () {
        addNewTask();
    })

    input.on('input', function () {
        message.css('visibility', 'hidden')
    })

    input.on('keypress', function (e) {
        if (e.which == 13) {
            addNewTask();
        }
    })

    tasks.on('click', '.task-remove', function () {
        let isConfirmed = confirm("Click OK to remove this task?")
        if (isConfirmed) {
            $(this).parent().remove();
        }
    })

    tasks.on('click', '.task-cbx', function () {
        $(this).next().toggleClass('task-done');
    })

    function getNewTask() {
        return `<li class="task">
                    <div class="task-cbx">
                        <input type="checkbox" unchecked>
                    </div>
                    <div class="task-text">${input.val()}</div>
                    <div class="task-remove"></div>
                </li>`
    }

    function getAllTasksName() {
        var allTasksName = $('.task-text').map(function () {
            return this.innerHTML;
        }).get();
        return allTasksName;
    }

    function isTaskDuplicated(name) {
        return getAllTasksName().includes(name)
    }

    function addNewTask() {
        let taskName = input.val();
        if (taskName) {
            if (isTaskDuplicated(taskName)) {
                alert("Duplicated task, please input another task!")
            }
            else {
                let newTask = getNewTask()
                tasks.append(newTask);
                input.val('');
                message.css('visibility', 'hidden')
            }

        }
        else {
            message.css('visibility', 'visible')
        }
    }

    tasks.sortable()
})


