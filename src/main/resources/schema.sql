-- Raw SQL build-up if necessary

CREATE TABLE TASK_CATEGORIES (
    category_id int NOT NULL AUTO_INCREMENT,
    category_name varchar(100) NOT NULL,
    category_description varchar(500),
    PRIMARY KEY(category_id),
    UNIQUE (category_name)
);

CREATE TABLE TASKS (
    task_id int NOT NULL AUTO_INCREMENT,
    task_name varchar(100) NOT NULL,
    task_description varchar(500),
    deadline timestamp NOT NULL,
    category_id int NOT NULL,
    PRIMARY KEY(task_id),
    CONSTRAINT TASK_CATEGORIES_FK
        FOREIGN KEY (category_id)
        REFERENCES task_categories(category_id)
        ON DELETE CASCADE
);
