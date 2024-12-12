# quiz-h2database
Created API endpoints for user who can start quiz, get question, submit answer to particular quiz session, and see the result stat
<br/>
<b> prerequisites <b/>
<li>
   <ul>java 17 or later</ul>
   <ul>maven</ul>
   <ul> git</ul>
</li>
<b> 1. Clone the repository </b>
<p>
   git clone repository-link <br/>
   cd quiz-h2database
</p>
<div>
<h3>Build and run</h3>
   <li>
      <ol>Build project
         <ul>mvn clean install</ul>
      </ol>
      <ol>run app
         <ul>mvn spring-boot:run</ul>
      </ol>
   </li>
</div>
<div>
   <h3>H2 database console</h3>
   <li>
      <ol>URL: http://localhost:8080/h2-console</ol>
      <ol>JDBC URL: jdbc:h2:mem:quiz</ol>
      <ol>username: root</ol>
      <ol>password: root</ol>
   </li>
</div>
<div>
   <h3>APIs</h3>
   <li>
      <ol>Start quiz: POST /api/quiz/start/{userId}</ol>
      <ol>Get Question: GET /api/quiz/question</ol>
      <ol>Submit answer: POST /api/quiz/submit/{sessionId}/{questionId}?answer={your_answer}</ol>
      <ol>Get statistic(result): GET /api/quiz/stats/{sessionId}</ol>
   </li>
</div>
