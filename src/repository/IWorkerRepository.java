
package repository;

import java.util.Hashtable;
import java.util.List;
import model.SalaryHistory;
import model.Worker;


public interface IWorkerRepository {
    void addWorker(Hashtable<String, Worker> workers);
    void changeSalary(Hashtable<String, Worker> workers, List<SalaryHistory> salaryHistorys, String status);
    void displaySalary(List<SalaryHistory> salaryHistorys);
}

