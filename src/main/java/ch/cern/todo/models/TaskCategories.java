package ch.cern.todo.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TASK_CATEGORIES")
public class TaskCategories {
    @Column(nullable = false, name = "category_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;

    @Column(nullable = false, unique = true)
    private String category_name;

    @Column
    private String category_description;

    @OneToMany(mappedBy="task_category", fetch=FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Tasks> tasks = new ArrayList<>();

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_description() {
        return category_description;
    }

    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }

    @Override
    public String toString() {
        return "(" + category_id + ") " + category_name + " - " + category_name;
    }
}
