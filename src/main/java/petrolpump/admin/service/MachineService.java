package petrolpump.admin.service;

import pertolpump.admin.model.MachineModel;
import java.util.*;
public interface MachineService {
 public boolean isAddNewMachine(MachineModel model,String typeid[],String []capacity);
 public List<Object[]> getAllMachine();
 public boolean isDeleteMachineById(int mid);
 public boolean isUpdateMAchine(MachineModel model);
}
