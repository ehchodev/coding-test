/**
 * @param {number[]} seats
 * @param {number[]} students
 * @return {number}
 */
var minMovesToSeat = function(seats, students) {
    seats.sort((a, b) => a - b);
    students.sort((a, b) => a - b);

    let cnt = 0;
    for (let i = 0; i < seats.length; i++) {
        cnt += Math.abs(seats[i] - students[i]);
    }

    return cnt;
};
