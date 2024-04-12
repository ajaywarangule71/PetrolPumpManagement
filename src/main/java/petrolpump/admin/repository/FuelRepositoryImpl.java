package petrolpump.admin.repository;

import java.util.*;

import pertolpump.admin.model.FuelTypeModel;
import petrolpump.admin.config.DBConfig;

public class FuelRepositoryImpl extends DBConfig implements FuelRepository{
	List<FuelTypeModel> list;
	@Override
	public boolean isAddFuelModel(FuelTypeModel model) {
		try {
			list = new ArrayList<FuelTypeModel>();
			stmt=conn.prepareStatement("insert into fueltype values('0',?)");
			stmt.setString(1, model.getName());
			return stmt.executeUpdate()>0?true:false;
		}catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
		
	}

	@Override
	public List<FuelTypeModel> getAllFuelTypes() {
		try {
			list = new ArrayList<FuelTypeModel>();
			stmt=conn.prepareStatement("select *from fueltype");
			rs=stmt.executeQuery();
			while(rs.next()) {
				FuelTypeModel model = new FuelTypeModel();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				list.add(model);
			}
			return list.size()>0?list:null;
		}catch(Exception ex) {
			System.out.println("Error is  "+ex);
		return null;
		}
	}

	@Override
	public boolean isDeleteFuelById(int typeid) {
		try {
			list = new ArrayList<FuelTypeModel>();
			stmt=conn.prepareStatement("delete from fueltype where typeid=?");
			stmt.setInt(1, typeid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}catch(Exception ex) {
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public boolean isUpdateFuel(FuelTypeModel model) {
		try {
			stmt = conn.prepareStatement("update fueltype set type=? where typeid=?");
			stmt.setString(1, model.getName());
			stmt.setInt(2, model.getId());
			int value = stmt.executeUpdate();
			return value > 0 ? true : false;

		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}

		
	}

}
