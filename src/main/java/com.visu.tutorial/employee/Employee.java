package com.visu.tutorial.employee;

public interface Employee {
	/**
	 * @return �������� ���������� �� ��������� ������.
	 */
	int getSalary();

	/**
	 * ����������� �������� ���������� �� �������� ��������
	 * @param value ��������, �� ������� ����� ���������
	 */
	public void increaseSalary(int value);

	/**
	 * @return ��� ����������
	 */
	public String getFirstName();

	/**
	 * ������������� ��� ����������
	 * @param firstName ����� ���
	 */
	public void setFirstName(String firstName);

	/**
	 * @return ������� ����������
	 */
	public String getLastName();

	/**
	 * ������������� ������� ����������
	 * @param lastName ����� �������
	 */
	public void setLastName(String lastName);

	/**
	 * @return ��� � ����� ������� ����������, ����������� �������� " " (������)
	 */
	public String getFullName();

	/**
	 * ������������� ��������� ����������.
	 * @param manager ���������, ���������� ���������� ������� ����������. 
	 * �� ������� ������������, ��� �������� �������� ����������� ������ com.visu.sandbox.ncedu.employee.EmployeeImpl.
	 */
	public void setManager(Employee manager);

	/**
	 * @return ��� � ������� ���������, ����������� �������� " " (������).
	 * ���� �������� �� �����, ���������� ������ "No manager".
	 */
	public String getManagerName();

	/**
	 * ���������� ��������� �������� ������, �.�. ������� �������� �����������, 
	 *   � ������� ������ ������ ���������.
	 * ���� ��� ������ ����������� ��� �� ������ ���������, ���������� ������� ����������.
	 * ���������: ��������� ��������, ������������� ������� {@link #setManager(Employee)},
	 *   ����� ���� ���������� ������� ������, ��� ������ ���-��������� ������ ����������
	 *   � ����� ������ com.visu.sandbox.ncedu.employee.EmployeeImpl. ����� ����, ��������� � ���������� com.visu.sandbox.ncedu.employee.Employee �� ���������
	 *   ������ getManager(), ����� ���-��������� ���������� ������������ � ���� �����.
	 *   ������ ����� ����� ������������ �������� (� ��� "����� ��������-��������������").
	 */
	public Employee getTopManager();

}
