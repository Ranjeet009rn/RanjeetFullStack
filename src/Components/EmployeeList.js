import React, { useEffect, useState } from "react";
import { getEmployees, deleteEmployee } from "../Services/EmployeeService";

function EmployeeList({ refresh }) {
  const [employees, setEmployees] = useState([]);

  const load = () => {
    getEmployees().then(res => setEmployees(res.data));
  };

  useEffect(() => {
    load();
  }, [refresh]);

  const handleDelete = (id) => {
    deleteEmployee(id).then(load);
  };

  return (
    <table className="table mt-4">
      <thead>
        <tr><th>Name</th><th>Email</th><th>Phone</th><th>Salary</th><th>Action</th></tr>
      </thead>
      <tbody>
        {employees.map(emp => (
          <tr key={emp.id}>
            <td>{emp.name}</td>
            <td>{emp.email}</td>
            <td>{emp.phone}</td>
            <td>{emp.salary}</td>
            <td><button className="btn btn-danger btn-sm" onClick={() => handleDelete(emp.id)}>Delete</button></td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}

export default EmployeeList;
