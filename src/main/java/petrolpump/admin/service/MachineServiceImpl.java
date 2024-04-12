package petrolpump.admin.service;

import java.util.List;

import pertolpump.admin.model.MachineModel;
import petrolpump.admin.repository.MachineRepository;
import petrolpump.admin.repository.MachineRepositoryImpl;

public class MachineServiceImpl implements MachineService{
	MachineRepository m=new MachineRepositoryImpl();

	@Override
	public boolean isAddNewMachine(MachineModel model,String typeid[],String []capacity) {
		
		return m.isAddNewMachine(model,typeid,capacity);
	}

	public List<Object[]> getAllMachine() {
		
		return m.getAllMachine();
	}

	@Override
	public boolean isDeleteMachineById(int mid) {
		// TODO Auto-generated method stub
		return m.isDeleteMachineById(mid);
	}

	@Override
	public boolean isUpdateMAchine(MachineModel model) {
		// TODO Auto-generated method stub
		return m.isUpdateMAchine(model);
	}

}
