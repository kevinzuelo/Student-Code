let cat = null;
let tractor = null;
let ben = null;
let quiet = true;
let quiet2 = true;
let javaStudentsAdded = false;
let csharpStudentsAdded = false;

const javaStudents = ['Colin', 'Thomas', 'Alex', 'Karmell', 'Joe',
'Miles', 'Steven', 'David T.', 'Kevin', 'Donny'];

const csharpStudents = ['Dante', 'Robert', 'Kelsie', 'Tom', 'Nikki',
'Chris', 'Michael', 'Shannon', 'Joey', 'Jaime', 'Dylan',
'David H.', 'Daniel'];

const students = javaStudents.concat(csharpStudents);


let inRoom = ['Ben'];

const instructors = ['Ben', 'David', 'Tori', 'Kaitlin'];

document.addEventListener('DOMContentLoaded', () => {
    const addAnother = document.getElementById('addLI');
    const theList = document.getElementById('classroom');
    cat = document.getElementById('mover');
    tractor = document.getElementById('mover2');
    ben = document.getElementById('headHoncho');
    main = document.querySelector('main');
    inRoom = ['Ben'];
    
    const btnAddJavaStudents = document.getElementById('btnAddJavaStudents');
    btnAddJavaStudents.addEventListener('click', () => {
        addJavaStudentsToList();
    })

    const btnAddCSharpStudents = document.getElementById('btnAddCSharpStudents');
    btnAddCSharpStudents.addEventListener('click', () => {
        addCSharpStudentsToList();
    })


    addAnother.addEventListener('click', () => {
        const fname = document.getElementById('fname').value;
        fname.innerText = '';
        const addDiv = document.getElementById('listAddDiv');
        addDiv.classList.remove('d-none');
        const addBtn = addDiv.querySelector('button');
        addBtn.addEventListener('click', addNameToList);
    });

    document.addEventListener('mousemove', (event) => {
        if (!quiet) {
            cat.style.left = event.pageX+4 + 'px';
            cat.style.top = event.pageY+4 + 'px';
            cat.style.transform = 'rotate('+((event.pageX-event.pageY) % 50)+'deg';
        }
        if (!quiet2) {
            tractor.style.left = event.pageX+4 + 'px';
            tractor.style.top = event.pageY+4 + 'px';
        }
    });
    
    ben.addEventListener('click', (event) => { quiet = !quiet; });
    theList.addEventListener('click', leaveRoom);
});    

function addNameToList() {
    const fname = document.getElementById('fname').value;
    const theList = document.getElementById('classroom');
    if (fname == '') {
        // Do nothing
    }
    else if (fname == 'Tasha') {
        alert('Wonderful! Tasha is always welcome.');
        quiet = false;
        const tasha = document.getElementById('mover');
        tasha.style.visibility = 'visible';
    } 
    else if (fname == 'Tractor') {
        alert("Hoggin' up the road on my p-p-p-p-plower\nChug a lug a luggin' 5 miles an hour\nOn my International Harvester");
        quiet2 = false;
        const harvester = document.getElementById('mover2');
        harvester.style.visibility = 'visible';
    } 
    else if (fname == 'Lucy') {
        alert('Sorry! Lucy is a chicken, and chickens are too messy for the classroom.');
    } 
    else if (fname == 'Jerry') {
        alert('Sorry! Dogs are too noisy for the classroom.');
    } 
    else if (inRoom.includes(fname)) {
        alert(fname+' is already in the classroom. Pay attention!')
    }
    else if (fname == 'John Savage' || fname == 'John') {
        const theOther = document.createElement('li');
        theOther.setAttribute('class', 'campusDirector');
        theOther.innerHTML = '<center><em>John<br />Savage</em></center>';
        theList.appendChild(theOther);
        inRoom.push(fname);
    }
    else {
        const theOther = document.createElement('li');
        if (fname == 'Tori') {
            theOther.setAttribute('id', 'tractorObsessed');
            theOther.addEventListener('click', (event) => { quiet2 = !quiet2; });
        }
        if (instructors.includes(fname)) {
            theOther.setAttribute('class', 'instructor');
        }
        theOther.innerText = fname;
        theList.appendChild(theOther);
        inRoom.push(fname);        
    }
    const addDiv = document.getElementById('listAddDiv');
    addDiv.classList.add('d-none');
    document.getElementById('fname').value = '';
    document.getElementById('fname').innerText = '';
}

function addJavaStudentsToList() {
    if (javaStudentsAdded && csharpStudentsAdded) {
        alert('The classroom is already full of students. Start teaching!');
    }
    else if (javaStudentsAdded) {
        alert('The classroom is already full of Java students. Start teaching!');
    }
    else {
        const theList = document.getElementById('classroom');

        javaStudents.forEach((student) => {
            if (!inRoom.includes(student)) {
                const theOther = document.createElement('li');
                theOther.innerText = student;
                theList.appendChild(theOther);
                inRoom.push(student);
            }
        });
        javaStudentsAdded = true;
    }
}

function addCSharpStudentsToList() {
    if (javaStudentsAdded && csharpStudentsAdded) {
        alert('The classroom is already full of students. Start teaching!');
    }
    else if (csharpStudentsAdded) {
        alert('The classroom is already full of C# students. Start teaching!');
    }
    else {
        const theList = document.getElementById('classroom');

        csharpStudents.forEach((student) => {
            if (!inRoom.includes(student)) {
                const theOther = document.createElement('li');
                theOther.innerText = student;
                theList.appendChild(theOther);
                inRoom.push(student);
            }
        });
        csharpStudentsAdded = true;
    }
}

function leaveRoom(event) {
    if (event.target.nodeName.toLowerCase() === "li" && event.target.innerText) {
        let choice = event.target.innerText;
        if (choice == 'Ben') {
            // Do nothing, as click has other meaning
        } else if (javaStudents.includes(choice)) {
            alert(choice + " can't leave. Class is starting soon.");
        } else if (csharpStudents.includes(choice)) {
            inRoom = inRoom.filter((student) => { return student != choice});
            event.currentTarget.removeChild(event.target);
            csharpStudentsAdded = false;
        } else {
            if (choice == 'Tori') {
                const harvester = document.getElementById('mover2');
                harvester.style.visibility = 'hidden';
            }
            inRoom = inRoom.filter((student) => { return student != choice});
            event.currentTarget.removeChild(event.target);
        }
    } 
}

      