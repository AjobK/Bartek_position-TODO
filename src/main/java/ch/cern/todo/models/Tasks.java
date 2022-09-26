package ch.cern.todo.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name="TASKS")
public class Tasks {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer task_id;

    @Column(nullable = false)
    private String task_name;

    @Column
    private String task_description;

    @Column(nullable = false)
    private Date deadline;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = TaskCategories.class)
    @JoinColumn(name="category_id", referencedColumnName = "category_id", nullable = false)
    private TaskCategories task_category;

    public Integer getTask_id() {
        return task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Integer getTask_category() {
        return task_category.getCategory_id();
    }

    public void setTask_category(TaskCategories task_category) {
        this.task_category = task_category;
    }
}
