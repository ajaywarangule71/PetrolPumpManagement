package petrolpump.admin.repository;

import java.util.List;

import pertolpump.admin.model.MachineModel;

public interface MachineRepository {
 public boolean isAddNewMachine(MachineModel model, String typeid[], String []capacity);
 public List<Object[]> getAllMachine();
 public boolean isDeleteMachineById(int mid);
 public boolean isUpdateMAchine(MachineModel model);
}
