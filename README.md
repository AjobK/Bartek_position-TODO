This is a skeleton of Spring Boot application which should be used as a start point to create a working one.
The goal of this task is to create simple web application which allows users to create TODOs via REST API.

Below you may find a proposition of the DB model:

![DB model](DBModel.png)

To complete the exercices please implement all missing classes and functonalites in order to be able to store and retrieve information about tasks and their categories.
Once you are ready, please send it to me (ie link to your git repository) before  our interview.

---

**Comment by Ajob**

As requested, the read and storing functions have been implemented for task categories and tasks. Since it wasn't a lot of work I also added deletion of individual entities.

This repository could greatly benefit from some form of exception handling, for example with lombok. For the scope of this assignment I thought it unwise to add unrequested features. Fortunately spring boot already has some form of exception handling when sending output to the user, masking any sensitive information.
