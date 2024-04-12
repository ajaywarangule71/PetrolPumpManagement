package petrolpump.admin.service;

import java.util.List;

import pertolpump.admin.model.FuelTypeModel;
import pertolpump.admin.model.MachineModel;

public interface FuelService {
	
	public boolean isAddFuelModel(FuelTypeModel model);
	public List<FuelTypeModel> getAllFuelTypes();
	
	public boolean isDeleteFuelById(int Typeid);
	 public boolean isUpdateFuel(FuelTypeModel model);

}
