var categoryList = [];
function addCategories() {
    categoryList.push($('#categories option:selected').val());
    console.log(categoryList);
}
