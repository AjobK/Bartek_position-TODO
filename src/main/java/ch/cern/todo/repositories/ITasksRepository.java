package ch.cern.todo.repositories;
import ch.cern.todo.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITasksRepository extends JpaRepository<Tasks, Integer> {
    // Currently Empty
}
