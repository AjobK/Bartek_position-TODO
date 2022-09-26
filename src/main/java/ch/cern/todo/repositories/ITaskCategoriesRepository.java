package ch.cern.todo.repositories;
import ch.cern.todo.models.TaskCategories;
import ch.cern.todo.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskCategoriesRepository extends JpaRepository<TaskCategories, Integer> {
    // Currently Empty
}
