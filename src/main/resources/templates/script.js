let balance = 1000; // Initial balance
let transactionHistory = [];

function showScreen(action) {
  const screenTitle = document.getElementById('screen-title');
  const actionScreen = document.getElementById('action-screen');
  const inputScreen = document.getElementById('input-screen');

  // Switch screens based on the action
  actionScreen.style.display = 'none';
  inputScreen.style.display = 'block';

  if (action === 'balance') {
    screenTitle.innerText = `Your Balance: $${balance}`;
    inputScreen.style.display = 'none'; // No input needed for balance check
  } else if (action === 'deposit' || action === 'withdraw') {
    screenTitle.innerText = action === 'deposit' ? 'Deposit Money' : 'Withdraw Money';
    inputScreen.style.display = 'block';
    inputScreen.setAttribute('data-action', action); // Save action type
  } else if (action === 'history') {
    const historyMessage = transactionHistory.length
      ? transactionHistory.join('\n')
      : 'No transactions yet.';
    screenTitle.innerText = 'Transaction History';
    alert(historyMessage);
    goBack(); // Return to the main screen after showing history
  }
}

function processTransaction() {
  const inputScreen = document.getElementById('input-screen');
  const amount = parseFloat(document.getElementById('amount-input').value);
  const action = inputScreen.getAttribute('data-action');

  if (isNaN(amount) || amount <= 0) {
    alert('Please enter a valid amount.');
    return;
  }

  if (action === 'deposit') {
    balance += amount;
    transactionHistory.push(`Deposited: $${amount}`);
    alert(`Successfully deposited $${amount}. New balance: $${balance}`);
  } else if (action === 'withdraw') {
    if (amount > balance) {
      alert('Insufficient balance!');
    } else {
      balance -= amount;
      transactionHistory.push(`Withdrew: $${amount}`);
      alert(`Successfully withdrew $${amount}. New balance: $${balance}`);
    }
  }

  document.getElementById('amount-input').value = ''; // Clear input
  goBack(); // Return to the main menu
}

function goBack() {
  document.getElementById('screen-title').innerText = 'Welcome to ATM';
  document.getElementById('action-screen').style.display = 'block';
  document.getElementById('input-screen').style.display = 'none';
}