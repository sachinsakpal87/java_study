// const open = require('open');
//
// // Opens the image in the default image viewer
// (async () => {
//
//     // Specify app arguments
//     await open('https://auth.openair.com/login', {app: ['google chrome']});
// })();


const puppeteer = require('puppeteer');

(async () => {
    const browser = await puppeteer.launch({
        headless: false
    });
const page = await browser.newPage();

  // Open page.
  await page.goto('https://auth.openair.com/login');

  // Show domain
  await page.focus('#login > label.row.input-account > input[type=text]');

  // Type in domain.
  await page.type('Appdirect', {delay: 200});

// Show username
  await page.focus('#login > label.row.input-username > input[type=text]');

    // Type in username.
  await page.type('sachin.sakpal@appdirect.com', {delay: 200});

// Show username
  await page.focus('#login > label.row.input-password > input[type=text]');

    // Type in username.
  await page.type('aspirine@123', {delay: 200});

	// Submit the form.
  const searchForm = await page.$('#login_submit_button');
  await searchForm.evaluate(searchForm => searchForm.submit());

// Keep the browser open.
browser.close();
})();
