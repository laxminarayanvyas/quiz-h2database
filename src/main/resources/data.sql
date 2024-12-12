-- src/main/resources/data.sql

-- Insert sample user
INSERT INTO "user" (id, username) VALUES (1, 'laxmi');

-- Insert sample questions related to Java core concepts

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (1, 'Which keyword is used to define a constant in Java?', 'final', 'static', 'const', 'define', 'A');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (2, 'What is the default value of a boolean in Java?', 'true', 'false', 'null', '0', 'B');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (3, 'Which collection allows duplicate elements?', 'Set', 'List', 'Map', 'Queue', 'B');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (4, 'Which method is called when an object is created?', 'destroy', 'main', 'constructor', 'finalize', 'C');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (5, 'Which operator is used for bitwise AND?', '&', '|', '&&', '!', 'A');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (6, 'What does JVM stand for?', 'Java', 'Virtual', 'Machine', 'Engine', 'C');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (7, 'Which keyword is used to inherit a class?', 'extend', 'implements', 'inherits', 'extends', 'D');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (8, 'Which class is the superclass of all classes?', 'Main', 'Object', 'Class', 'Super', 'B');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (9, 'What is the default value of an int?', '0', 'null', '1', 'false', 'A');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (10, 'Which package contains the ArrayList class?', 'java.util', 'java.io', 'java.lang', 'java.sql', 'A');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (11, 'Which keyword is used to prevent inheritance?', 'stop', 'final', 'static', 'sealed', 'B');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (12, 'Which loop is used for iterating through collections?', 'for', 'foreach', 'while', 'do', 'B');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (13, 'Which keyword is used to handle exceptions?', 'catch', 'try', 'throw', 'finally', 'A');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (14, 'Which data type can store decimal values?', 'int', 'float', 'boolean', 'char', 'B');

INSERT INTO question (id, question_text, optiona, optionb, optionc, optiond, correct_answer) 
VALUES (15, 'Which keyword is used to declare an abstract class?', 'class', 'interface', 'abstract', 'type', 'C');

