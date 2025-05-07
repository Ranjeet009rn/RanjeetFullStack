import axios from 'axios';

const API_BASE_URL = "https://localhost:7162/api/employees";

export const getEmployees = async () => {
  return axios.get(API_BASE_URL);
};

export const addEmployee = async (employee) => {
  return axios.post(API_BASE_URL, employee);
};

export const deleteEmployee = async (id) => {
  return axios.delete(`${API_BASE_URL}/${id}`);
};
