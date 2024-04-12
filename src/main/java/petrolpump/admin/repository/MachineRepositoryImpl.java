package petrolpump.admin.repository;

import java.util.*;

import pertolpump.admin.model.MachineModel;
import petrolpump.admin.config.DBConfig;

public class MachineRepositoryImpl extends DBConfig implements MachineRepository {
	List<Object[]> list;
	int mid;

	public int getMachineIdAutomatic() {
		try {
			stmt = conn.prepareStatement("select max(mid) from machineinfo");
			rs = stmt.executeQuery();
			if (rs.next()) {
				mid = rs.getInt(1);
			}
			++mid;
			return mid;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return -1;
		}
	}

	@Override
	public boolean isAddNewMachine(MachineModel model, String typeid[], String[] capacity) {
		try {
			mid = this.getMachineIdAutomatic();
			String machineCode = model.getMachinecode();
			stmt = conn.prepareStatement("insert into machineinfo values(" + mid + ",'" + machineCode + "')");

			int value = stmt.executeUpdate();
			int j = 0;
			if (value > 0) {
				for (int i = 0; i < capacity.length; i++) {
					if (capacity[i].equals("")) {

					} else {
						stmt = conn.prepareStatement("insert into machinetypejoin values(?,?,?)");
						stmt.setInt(1, mid);
						stmt.setInt(2, Integer.parseInt(typeid[j]));
						stmt.setInt(3, Integer.parseInt(capacity[i]));
						j++;


						value = stmt.executeUpdate();
					}
				}
				return value > 0 ? true : false;
			} else {

				return false;
			}
		} catch (Exception ex) {
			System.out.println("Error is" + ex);
			return false;
		}

	}

	public List<Object[]> getAllMachine() {
		try {
			list = new ArrayList<Object[]>();
			stmt = conn.prepareStatement(
					"select m.machinecode, f.type, mtj.capacity,m.mid from machineinfo m left join machinetypejoin mtj on m.mid=mtj.mid left join fueltype f on f.typeid=mtj.typeid");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Object[] obj = new Object[] { rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4) };
				list.add(obj);
			}
			return list.size() > 0 ? list : null;
		} catch (Exception ex) {
			System.out.println("Error is" + ex);
		}
		return null;
	}

	@Override
	public boolean isDeleteMachineById(int mid) {
		try {
			stmt = conn.prepareStatement("delete from machineinfo where mid=?");
			stmt.setInt(1, mid);
			int value = stmt.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}

	}

	@Override
	public boolean isUpdateMAchine(MachineModel model) {
		try {
			stmt = conn.prepareStatement("update machineinfo set machinecode=? where mid=?");
			stmt.setString(1, model.getMachinecode());
			stmt.setInt(2, model.getId());
			int value = stmt.executeUpdate();
			return value > 0 ? true : false;

		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}

	}

}
