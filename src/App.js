import React, { useState } from "react";
import EmployeeList from "./Components/EmployeeList";
import AddEmployeeForm from "./Components/AddEmployeeForm";

const App = () => {
  const [refresh, setRefresh] = useState(false);

  const reload = () => setRefresh(prev => !prev); // Triggers re-render

  return (
    <div style={{ padding: "20px" }}>
      <h1>Employee Manager</h1>
      <AddEmployeeForm onEmployeeAdded={reload} />
      <EmployeeList key={refresh} />
    </div>
  );
};

export default App;
