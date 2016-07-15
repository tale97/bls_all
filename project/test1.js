
var APP_ID = undefined; 
var AlexaSkill = require('./AlexaSkill');
var FACTS = [
    "1 plus 1 is 2",
    "2 plus 2 is 4",
    "4 plus 4 is 8",
    "8 plus 8 is 16","16 plus 16 is 32"
];
var TestSkill = function () {
    AlexaSkill.call(this, APP_ID);
};

TestSkill.prototype = Object.create(AlexaSkill.prototype);
TestSkill.prototype.constructor = TestSkill;

TestSkill.prototype.eventHandlers.onSessionStarted = function (sessionStartedRequest, session) {
   // console.log("onSessionStarted requestId: " + sessionStartedRequest.requestId + ", sessionId: " + session.sessionId);
};
TestSkill.prototype.eventHandlers.onSessionEnded = function (sessionEndedRequest, session) {
   // console.log("onSessionEnded requestId: " + sessionEndedRequest.requestId + ", sessionId: " + session.sessionId);
    // any cleanup logic goes here
};

TestSkill.prototype.eventHandlers.onLaunch = function (launchRequest, session,response) {
    //console.log("TestSkill onLaunch requestId: " + launchRequest.requestId + ", sessionId: " + session.sessionId);
        
        handleTest(response);
};


TestSkill.prototype.intentHandlers = {
    "TestIntent": function (intent,session,response){
        handleTest(response);
    },
    
      "AMAZON.HelpIntent": function (intent, session, response) {
        response.ask("You can say tell me a space fact, or, you can say exit... What can I help you with?", "What can I help you with?");
    },

    "AMAZON.StopIntent": function (intent, session, response) {
        var speechOutput = "Goodbye";
        response.tell(speechOutput);
    },

    "AMAZON.CancelIntent": function (intent, session, response) {
        var speechOutput = "Goodbye";
        response.tell(speechOutput);
    }
};


function handleTest(response){
    var index = Math.floor(Math.random() * FACTS.length);
    var randomFact = FACTS[index];
    
    var speechOutput = "Okay, " + randomFact;
    var cardTitle = "fact";
    response.tellWithCard(speechOutput, cardTitle, speechOutput);
    
}



exports.handler = function (event, context) {
    // Create an instance of the WiseGuy Skill.
    var skill = new TestSkill();
    skill.execute(event, context);
};
