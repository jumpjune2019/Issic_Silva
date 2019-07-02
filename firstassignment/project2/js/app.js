$.ready(function() {
	$.get('title').innerHTML = $.string.format("Pokemon Quiz {0}", $.getVersion());

	var stack = []; //this stack holds the answer
	var stackId = []; //this stack gets the id for the answer
	var finalStack = []; //third stack gets the id for the dropzone
	

	// variables for the items being dragged
	var dragItem1 = document.getElementById("termWidget1");
	var dragItem2 = document.getElementById("termWidget2");
	var dragItem3 = document.getElementById("termWidget3");
	var dragItem4 = document.getElementById("termWidget4");
	var dragItem5 = document.getElementById("termWidget5");
	
	// variables too access where the items get dropped
	var dropArea1 = document.getElementById("droppedTerm1");
	var dropArea2 = document.getElementById("droppedTerm2");
	var dropArea3 = document.getElementById("droppedTerm3");
	var dropArea4 = document.getElementById("droppedTerm4");
	var dropArea5 = document.getElementById("droppedTerm5");

	// variables for the area where the term/question goes
	var questionArea1 = document.getElementById("question1");
    var questionArea2 = document.getElementById("question2");
    var questionArea3 = document.getElementById("question3");
    var questionArea4 = document.getElementById("question4");
    var questionArea5 = document.getElementById("question5");

	

	function startDragItemFunc(e) {
		e.dataTransfer.setData("text", e.target.id);
		
	}
			
		
	function dropItemFunc(e) {
		e.preventDefault();
		var data = e.dataTransfer.getData("text");
		stackId.push(event.dataTransfer.getData("text"));
		var dragEl = document.getElementById(data);
		if(e.target.innerHTML == "Empty"){
		e.target.innerHTML = dragEl.innerHTML;
		e.target.setAttribute('linkid', dragEl.getAttribute('linkid'));
		finalStack.push(e.target.id);
		stack.push(e.target.innerHTML);
		dragEl.innerHTML = "Empty";
		dragEl.setAttribute('draggable', false);

		//Attempting to disable redo button when stack is empty
		if(!Array.isArray(finalStack) || !finalStack.length){
			buttonRedo.setAttribute("disabled", true);
			console.log("stack is empty");
		}else{
			buttonRedo.removeAttribute("disabled");
			console.log("stack is not empty");
		}
		}
	}
	
	function dragOverItemFunc(e) {
		e.preventDefault();
	}

	//event listeners for dragging
	dragItem1.addEventListener("dragstart", startDragItemFunc, false);
	dropArea1.addEventListener("drop", dropItemFunc, false);
	dropArea1.addEventListener("dragover", dragOverItemFunc, false);
	
	dragItem2.addEventListener("dragstart", startDragItemFunc, false);
	dropArea2.addEventListener("drop", dropItemFunc, false);
	dropArea2.addEventListener("dragover", dragOverItemFunc, false);

	dragItem3.addEventListener("dragstart", startDragItemFunc, false);
	dropArea3.addEventListener("drop", dropItemFunc, false);
	dropArea3.addEventListener("dragover", dragOverItemFunc, false);

	dragItem4.addEventListener("dragstart", startDragItemFunc, false);
	dropArea4.addEventListener("drop", dropItemFunc, false);
	dropArea4.addEventListener("dragover", dragOverItemFunc, false);

	dragItem5.addEventListener("dragstart", startDragItemFunc, false);
	dropArea5.addEventListener("drop", dropItemFunc, false);
	dropArea5.addEventListener("dragover", dragOverItemFunc, false);

	

	  function formatTime(seconds){
			var h = Math.floor(seconds / 3600), 
		m = Math.floor(seconds / 60) % 60, 
		s = seconds % 60;
			if (h < 10) h = "0" + h;
			if (m < 10) m = "0" + m;
			if (s < 10) s = "0" + s;
			return h + ":" + m + ":" + s;
		}
		var count = 0;
		var counter;

		

		function startTimer(){
			counter = setInterval(timer, 1000);
		}

		function timer() {
				count++;
				document.getElementById('elapsedTime').innerHTML = formatTime(count);
		}

		
		function stopTimer(){
			clearInterval(counter);
		}

		function resetTimer(){
				document.getElementById('elapsedTime').innerHTML = '00:00:00';
				count = 0;
		}


		function setDraggableTrue(){
			dragItem1.setAttribute("draggable", true);
			dragItem2.setAttribute("draggable", true);
			dragItem3.setAttribute("draggable", true);
			dragItem4.setAttribute("draggable", true);
			dragItem5.setAttribute("draggable", true);
		}

		function setDraggableFalse(){
			dragItem1.setAttribute("draggable", false);
			dragItem2.setAttribute("draggable", false);
			dragItem3.setAttribute("draggable", false);
			dragItem4.setAttribute("draggable", false);
			dragItem5.setAttribute("draggable", false);
		}

		var getResults = document.getElementById("score");

		 function getScore(){

		 	//variables for comparison
        	var questionCompare1 = questionArea1.getAttribute('linkid');
        	var dropCompare1 = dropArea1.getAttribute('linkid');

        	var questionCompare2 = questionArea2.getAttribute('linkid');
        	var dropCompare2 = dropArea2.getAttribute('linkid');

        	var questionCompare3 = questionArea3.getAttribute('linkid');
        	var dropCompare3 = dropArea3.getAttribute('linkid');

        	var questionCompare4 = questionArea4.getAttribute('linkid');
        	var dropCompare4 = dropArea4.getAttribute('linkid');

        	var questionCompare5 = questionArea5.getAttribute('linkid');
        	var dropCompare5 = dropArea5.getAttribute('linkid');

        	var correctCounter = 0;
        	//make the comparison to term and question
        	if(questionCompare1 == dropCompare1){
        		correctCounter++;
        		dropArea1.setAttribute("style", "background-color: lawngreen;");
        	}else{
        		dropArea1.setAttribute("style", "background-color: red;");
        	}
        	if(questionCompare2 == dropCompare2){
        		correctCounter++;
        		dropArea2.setAttribute("style", "background-color: lawngreen;");
        	}else{
        		dropArea2.setAttribute("style", "background-color: red;");
        	}
        	if(questionCompare3 == dropCompare3){
        		correctCounter++;
        		dropArea3.setAttribute("style", "background-color: lawngreen;");
        	}else{
        		dropArea3.setAttribute("style", "background-color: red;");
        	}
        	if(questionCompare4 == dropCompare4){
        		correctCounter++;
        		dropArea4.setAttribute("style", "background-color: lawngreen;");
        	}else{
        		dropArea4.setAttribute("style", "background-color: red;");
        	}
        	if(questionCompare5 == dropCompare5){
        		correctCounter++;
        		dropArea5.setAttribute("style", "background-color: lawngreen;");
        	}else{
        		dropArea5.setAttribute("style", "background-color: red;");
        	}

        	//display results in scoreboard
        	if(correctCounter == 0){
        		getResults.innerHTML = "You got " + correctCounter + " out of 5! Do you understand the rules?...";
        	}else if(correctCounter == 1){
        		getResults.innerHTML = "You got " + correctCounter + " out of 5! Do better...";
        	}else if(correctCounter == 2){
        		getResults.innerHTML = "You got " + correctCounter + " out of 5! Eh...you know something.";
        	}else if(correctCounter == 3){
        		getResults.innerHTML = "You got " + correctCounter + " out of 5! Decent, keep at it.";
        	}else if(correctCounter == 4){
        		getResults.innerHTML = "You got " + correctCounter + " out of 5! So close!";
        	}else if(correctCounter == 5){
        		getResults.innerHTML = "You got " + correctCounter + " out of 5! Perfect score!";
        	}

        }

		function play(){
			startTimer();
			setDraggableTrue();
			buttonRedo.removeAttribute("hidden");
			buttonRedo.setAttribute("disabled", true);
			getInfo();

			dropArea1.innerHTML = "Empty";
			dropArea2.innerHTML = "Empty";
			dropArea3.innerHTML = "Empty";
			dropArea4.innerHTML = "Empty";
			dropArea5.innerHTML = "Empty";

		}

		function end(){
			stopTimer();
			setDraggableFalse();
			buttonRedo.setAttribute("hidden", true);
		}

		function resetGame(){
			resetTimer();
			buttonRedo.setAttribute("hidden", true);
			//reset text back to instructions.
			{
				dragItem1.innerHTML = "Hello!";
				dragItem2.innerHTML = "This is a";
				dragItem3.innerHTML = "quiz game in";
				dragItem4.innerHTML = "where you match";
				dragItem5.innerHTML = "the term";

				dropArea1.innerHTML = "on the left";
				dropArea2.innerHTML = "to the question";
				dropArea3.innerHTML = "or definition";
				dropArea4.innerHTML = "on the right";
				dropArea5.innerHTML = "by clicking";

				questionArea1.innerHTML = "and dragging";
				questionArea2.innerHTML = "to the drop area.";
				questionArea3.innerHTML = "Start by clicking";
				questionArea4.innerHTML = "the play button";
				questionArea5.innerHTML = "and good luck!";

				getResults.innerHTML = "ScoreBoard 0 of 5";
			}

			//reset the stacks
			{
				stack = [];
				stackId = [];
				finalStack = [];
			}

			//reset the background colors
			{
				dropArea1.setAttribute("style", "background-color: cyan;");
				dropArea2.setAttribute("style", "background-color: cyan;");
				dropArea3.setAttribute("style", "background-color: cyan;");
				dropArea4.setAttribute("style", "background-color: cyan;");
				dropArea5.setAttribute("style", "background-color: cyan;");
			}
		}	
				

		var changeButton = function(e) {
		var val = e.target.getAttribute("nextstate");
		e.target.value = val;
		switch(val) {					
			case "play":
				val = "lock selections";
				resetGame();
			break;
			case "lock selections":
				val = "show score";
				//end();
				play();
			break;
			case "show score":
				val = "reset game";
				end();
			break;
			case "reset game":
				val = "play";
				getScore();
			break;
		}
		e.target.setAttribute("nextstate", val);
	}
	var buttonPlay = document.getElementById("controlButton");
	buttonPlay.addEventListener("click", changeButton, false);


	//The undo button uses stacks to keep track of draggable changes
	var undo = function undo(){

		var temp = stack.pop();
		var tempId = stackId.pop();
		var tempDropId = finalStack.pop();
		document.getElementById(tempId).innerHTML = temp;
		document.getElementById(tempId).setAttribute("draggable", true);
		document.getElementById(tempDropId).innerHTML = "Empty";
		if(!Array.isArray(finalStack) || !finalStack.length){
			buttonRedo.setAttribute("disabled", true);
			console.log("stack is empty");
		}else{
			buttonRedo.removeAttribute("disabled");
			console.log("stack is not empty");
		}
	}

	var buttonRedo = document.getElementById("undo");
	buttonRedo.addEventListener("click", undo, false);

	function getInfo(){

		var getJSONOnce = false;

		if(getJSONOnce == false){
			getJSON();
			getJSONOnce = true;
		}


		function getJSON(){
			fetch('data/quiz_info_v9.json')
	            .then(function (response) {
	                return response.json();
	            })
	            .then(function (data) {
	            	setData(data);
	            })
	            .catch(function (err) {
	                console.log('error: ' + err);
	            });
        }


        function shuffle(array) {
  			array.sort(() => Math.random() - 0.5);
			}

		var questionArray = [];
        var answerArray = [];

        function setData(data) {
            

            shuffle(data);

            var data2 =[];

        	data2 = data
        	
        	data2 = data2.splice(4,5);


        	
        	//spliting array into question and answer array
            for (var i = 0; i < data2.length; i++) {
        	 		questionArray.push({
						id: i,
						value: data2[i].question
					});
					answerArray.push({
						id: i,
						value: data2[i].answer
					});
            }
            
            shuffle(answerArray);
        	
        	//assigns the information to the designated fields
            for (var i = 0; i < data2.length; i++) {

      			if(i == 0){
					dragItem1.innerHTML = answerArray[i].value;
					dragItem1.setAttribute("linkid", answerArray[i].id);
					questionArea1.innerHTML = questionArray[i].value;
					questionArea1.setAttribute("linkid", questionArray[i].id);
      			}
      			if(i == 1){
      				dragItem2.innerHTML = answerArray[i].value;
      				dragItem2.setAttribute("linkid", answerArray[i].id);
					questionArea2.innerHTML = questionArray[i].value;
					questionArea2.setAttribute("linkid", questionArray[i].id);
      			}
      			if(i == 2){
      				dragItem3.innerHTML = answerArray[i].value;
      				dragItem3.setAttribute("linkid", answerArray[i].id);
					questionArea3.innerHTML = questionArray[i].value;
					questionArea3.setAttribute("linkid", questionArray[i].id);
      			}
      			if(i == 3){
      				dragItem4.innerHTML = answerArray[i].value;
      				dragItem4.setAttribute("linkid", answerArray[i].id);
					questionArea4.innerHTML = questionArray[i].value;
					questionArea4.setAttribute("linkid", questionArray[i].id);
      			}
      			if(i == 4){
      				dragItem5.innerHTML = answerArray[i].value;
      				dragItem5.setAttribute("linkid", answerArray[i].id);
					questionArea5.innerHTML = questionArray[i].value;
					questionArea5.setAttribute("linkid", questionArray[i].id);
      			}
            }
        }



	}

});