# FiringSystem
Design a firing system in an organization.

// There is down-turn in the ship-building industry. Ace Shipping Corp (ASC) wants to be prepared by having a system that will help 
// evaluate the total cost saving they will achieve if they were to ‘let go’ some employees.
// Following are the rules for drawing up this Firing List:
// Each manager at every level in the organization will have to contribute ‘heads’ from his team to the firing list
// The input to the system would be a small integer k (=1,2, etc) which would be the number of employees chosen per manager. The 
// output would be the total cost saved for this k. Different values of k would give an idea of the total cost saving achieved.
// The primary selection criteria is Performance Rating. k employees with the minimum rating under a given manager are to be selected.
// If two employees have the same rating, the one with the higher salary gets selected (to maximize cost saved)
// The activity might be requested for the sub-org under any manager. The default is to consider the entire org.
// Although total number of reportees for a manager is usually of the order of 10, it could possibly be a much larger number in 
// some org too. An optimal way of choosing the k reportees would be preferred.
// The following information needs to get stored per Employee:

// 1.Employee ID (unique)
// 2.Name
// 3.Performance Rating (1-5, 1 is lowest, 5 is highest)
// 4.Salary (Rs)
