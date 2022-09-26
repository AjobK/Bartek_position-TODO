DELETE FROM TASKS;
DELETE FROM TASK_CATEGORIES;

-- 4 Categories
INSERT INTO TASK_CATEGORIES (category_name, category_description) VALUES ('Backlog', 'Will be part of a future sprint');
INSERT INTO TASK_CATEGORIES (category_name, category_description) VALUES ('Current Sprint', 'Will be done this sprint');
INSERT INTO TASK_CATEGORIES (category_name, category_description) VALUES ('Done', 'Has been finished in the current sprint');
INSERT INTO TASK_CATEGORIES (category_name, category_description) VALUES ('Other', 'Any other tasks');

-- 8 Tasks (2 for each category)
-- IDs are not auto-generated because this could expose business information, for
-- example the amount of tasks made in total, etc. Preferably UUID.
INSERT INTO TASKS (task_name, task_description, deadline, category_id) VALUES ('Sensor Technology Test', 'You got this', '2022-10-23 15:30:00.000', 1);
INSERT INTO TASKS (task_name, task_description, deadline, category_id) VALUES ('Technical Studentship Intro', 'Maybe?', '2023-02-01 08:00:00.000', 1);
INSERT INTO TASKS (task_name, task_description, deadline, category_id) VALUES ('Surprise Party Prep', 'Make sure not to disappoint', '2023-01-12 08:30:00.000', 2);
INSERT INTO TASKS (task_name, task_description, deadline, category_id) VALUES ('Important', 'Some really important thing', '2023-01-12 08:30:00.000', 2);
INSERT INTO TASKS (task_name, task_description, deadline, category_id) VALUES ('Talk to Bartek', 'We will talk on wednesday from 10:00 to 10:30', '2022-09-28 10:30:00.000', 3);
INSERT INTO TASKS (task_name, task_description, deadline, category_id) VALUES ('Bouldering Competition', 'Make sure to climb V18 before deadline', '2022-10-05 12:00:00.000', 3);
INSERT INTO TASKS (task_name, task_description, deadline, category_id) VALUES ('This assignment', 'It is awesome', '2022-09-27 23:00:00.000', 4);
INSERT INTO TASKS (task_name, task_description, deadline, category_id) VALUES ('Read Brandon Sanderson book', 'Especially stormlight archive', '2022-09-28 20:00:00.000', 4);
