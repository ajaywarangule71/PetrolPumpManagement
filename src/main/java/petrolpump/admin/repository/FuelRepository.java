package petrolpump.admin.repository;

import pertolpump.admin.model.FuelTypeModel;
import java.util.*;
public interface FuelRepository {
	public boolean isAddFuelModel(FuelTypeModel model);
	public List<FuelTypeModel> getAllFuelTypes();
	public boolean isDeleteFuelById(int typeid);
	public boolean isUpdateFuel(FuelTypeModel model);
	
}
