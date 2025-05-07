import React, { useState } from "react";
import { addEmployee } from "../Services/EmployeeService"; // ✅ Correct function name

const AddEmployeeForm = ({ onEmployeeAdded }) => {
  const [form, setForm] = useState({
    name: "",
    email: "",
    phone: "",
    salary: "",
  });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await addEmployee(form); // ✅ Correct function used
      setForm({ name: "", email: "", phone: "", salary: "" }); // Reset form
      onEmployeeAdded(); // Refresh list
    } catch (error) {
      console.error("Error adding employee:", error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Add Employee</h2>
      <input
        type="text"
        name="name"
        placeholder="Name"
        value={form.name}
        onChange={handleChange}
        required
      />
      <input
        type="email"
        name="email"
        placeholder="Email"
        value={form.email}
        onChange={handleChange}
        required
      />
      <input
        type="text"
        name="phone"
        placeholder="Phone"
        value={form.phone}
        onChange={handleChange}
        required
      />
      <input
        type="number"
        name="salary"
        placeholder="Salary"
        value={form.salary}
        onChange={handleChange}
        required
      />
      <button type="submit">Add Employee</button>
    </form>
  );
};

export default AddEmployeeForm;
